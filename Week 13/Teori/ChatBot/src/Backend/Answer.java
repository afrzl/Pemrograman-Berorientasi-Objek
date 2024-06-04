package Backend;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Answer {
    private int id;
    private String answer;
    private String category;

    public Answer() {}

    public Answer(String answer, String category) {
        this.answer = answer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Answer getById(int id) throws SQLException {
        Answer ans = new Answer();
        ResultSet rs = Database.selectQuery("SELECT * FROM answer WHERE id = '" + id + "'");

        try {
            while(rs.next()) {
                ans.setId(rs.getInt("id"));
                ans.setAnswer(rs.getString("answer"));
                ans.setCategory(rs.getString("category"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ans;
    }

    public ArrayList<Answer> getAll() throws SQLException {
        ArrayList<Answer> listAnswer = new ArrayList<>();
        ResultSet rs = Database.selectQuery("SELECT * FROM answer");

        try {
            while(rs.next()) {
                Answer ans = new Answer();
                ans.setId(rs.getInt("id"));
                ans.setAnswer(rs.getString("answer"));
                ans.setCategory(rs.getString("category"));

                listAnswer.add(ans);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listAnswer;
    }

    public String searchAnswer(String keyword) throws SQLException {
        String[] kolom = {"Id", "Nama", "Keterangan"};
        Answer ans = new Answer();
        ArrayList<Answer> listAnswer = new Answer().search(keyword);
        String answer;
        Answer rand = Answer.getRandomAnswer(listAnswer);
        answer = rand.getAnswer();

        return answer;
    }

    public ArrayList<Answer> filterAsk(String keyword) throws SQLException {
        ArrayList<Answer> hasilCategory = new ArrayList();
        String sqlSearch = "SELECT * FROM ask WHERE ask = '" + keyword.toString() + "'";
        ResultSet rs = Database.selectQuery(sqlSearch);
        Answer ans = new Answer();
        try {
            while (rs.next()) {
                ans.setCategory(rs.getString("category"));
                hasilCategory.add(ans);
            }

        } catch (Exception e) {
            ans.setCategory("undefined");
            hasilCategory.add(ans);
        }
        return hasilCategory;
    }

    public ArrayList<Answer> search(String keyword) throws SQLException {
        ArrayList<Answer> listAnswer = new ArrayList();
        String sqlSearch = "SELECT * FROM answer WHERE category LIKE '%" + keyword + "%'";
        ResultSet rs = Database.selectQuery(sqlSearch);
        try {
            while (rs.next()) {
                Answer ans = new Answer();
                ans.setId(rs.getInt("id"));
                ans.setAnswer(rs.getString("answer"));
                ans.setCategory(rs.getString("category"));

                listAnswer.add(ans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnswer;
    }

    public static Answer getRandomAnswer(List<Answer> answer) {
        return answer.get(new Random().nextInt(answer.size()));
    }

    public void save() throws SQLException {
        if (getById(id).getId() == 0) {
            String sqlInsert = "INSERT INTO answer (answer,category) VALUES('" + this.answer + "','" + this.category + "')";
            this.id = Database.insertQueryGetId(sqlInsert);
        } else {
            String sqlUpdate = "UPDATE answer SET answer ='" + this.answer + "', category = '" + this.category + "' WHERE id= '" + this.id + "'";
            Database.executeQuery(sqlUpdate);
        }
    }

    public void delete() throws SQLException {
        String sqlDelete = "DELETE FROM answer WHERE id='" + this.id + "'";
        Database.executeQuery(sqlDelete);
    }

}
