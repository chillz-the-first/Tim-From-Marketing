class Badge {
    public String print(Integer id, String name, String department) {
        String idTag = "[" + id + "] - " + name + " - " + department;

        if (id == null && department == null) {
            idTag = name + " - OWNER";
        }
        else if (id == null) {
            idTag = name + " - " + department;
        }
        else if (department == null) {
            idTag = "[" + id + "] - " + name + " - OWNER";
        }

        return idTag;
    }
}