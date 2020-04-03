/**
 * Staff
 */
abstract class Staff {
    private String id;
    private String name;
    private Integer age;
    private Double salaryScale;
    private String startDate;
    private String department;
    private Integer annualLeave;

    /**
     * @param id
     * @param name
     * @param age
     * @param salaryScale
     * @param startDate
     * @param department
     * @param annualLeave
     */
    Staff(
            final String id,
            final String name,
            final Integer age,
            final Double salaryScale,
            final String startDate,
            final String department,
            final Integer annualLeave) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryScale = salaryScale;
        this.startDate = startDate;
        this.department = department;
        this.annualLeave = annualLeave;
    }

    /**
     * @return the id
     */
    public String getId() {
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
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    void setAge(final Integer age) {
        this.age = age;
    }

    /**
     * @return the salaryScale
     */
    Double getSalaryScale() {
        return salaryScale;
    }

    /**
     * @param salaryScale the salaryScale to set
     */
    void setSalaryScale(final Double salaryScale) {
        this.salaryScale = salaryScale;
    }

    /**
     * @return the startDate
     */
    String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the department
     */
    String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    void setDepartment(final String department) {
        this.department = department;
    }

    /**
     * @return the annualLeave
     */
    Integer getAnnualLeave() {
        return annualLeave;
    }

    /**
     * @param annualLeave the annualLeave to set
     */
    void setAnnualLeave(final Integer annualLeave) {
        this.annualLeave = annualLeave;
    }

    abstract public String toString();
}
