/**
 * Manager
 */
class Manager extends Staff implements ICalculator {
    private String title;

    /**
     * @param id
     * @param name
     * @param age
     * @param salaryScale
     * @param startDate
     * @param department
     * @param annualLeave
     * @param title
     */
    Manager(
            final String id,
            final String name,
            final Integer age,
            final Double salaryScale,
            final String startDate,
            final String department,
            final Integer annualLeave,
            final String title) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.title = title;
    }

    /**
     * @return the title
     */
    String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public Double calculateSalary() {
        return (getSalaryScale() * 5000000) +
                (getTitle() == "Business Leader" ? 8000000
                        : getTitle() == "Project Leader" ? 5000000
                                : 6000000);
    }

    static String getHeader() {
        return String.format(
                "%-10s%-15s%-10s%-20s%-20s%-20s%-20s%-20s\n%s",
                "ID",
                "Name",
                "Age",
                "SalaryScale",
                "StartDate",
                "Department",
                "AnnualLeave",
                "Title",
                "-----------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format(
                "%-10s%-15s%-10s%-20s%-20s%-20s%-20s%-20s",
                getId(),
                getName(),
                getAge(),
                getSalaryScale(),
                getStartDate(),
                getDepartment(),
                getAnnualLeave(),
                getTitle());
    }
}
