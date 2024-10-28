public class Certificato {
    private String expiredDate;
    private String description;

    public Certificato(String expiredDate, String description) {
        this.expiredDate = expiredDate;
        this.description = description;
    }
    public String getExpiredDate() {
        return expiredDate;
    }
    public String getDescription() {
        return description;
    }
}
