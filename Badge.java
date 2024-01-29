class Badge {
    public String print(Integer id, String name, String department) {
        String idTag = "";

        if (id == null && department == null) {
            idTag = name + " - OWNER";
        }
        else if (id == null) {
            idTag = name + " - " + department.toUpperCase();
        }
        else if (department == null) {
            idTag = "[" + id + "] - " + name + " - OWNER";
        }
        else {
            idTag = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }

        return idTag;
    }
}