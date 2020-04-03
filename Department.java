/**
 * Department
 */
class Department {
    private String id;
    private String name;
    private Integer totalEmployees;

    /**
     * @param id
     * @param name
     * @param totalEmployees
     */
    Department(final String id, final String name, final Integer totalEmployees) {
        this.id = id;
        this.name = name;
        this.totalEmployees = totalEmployees;
    }

    /**
     * @return the id
     */
    String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    void setId(final String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the totalEmployees
     */
    Integer getTotalEmployees() {
        return totalEmployees;
    }

    /**
     * @param totalEmployees the totalEmployees to set
     */
    void setTotalEmployees(final Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    static String getHeader() {
        return String.format(
                "%-20s%-20s%-20s\n%s",
                "ID",
                "Name",
                "Total Employees",
                "------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format(
                "%-20s%-20s%-20s",
                getId(),
                getName(),
                getTotalEmployees());
    }
}
