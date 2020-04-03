/**
 * Employee
 */
class Employee extends Staff implements ICalculator {
    private Integer overTime;

    /**
     * @param id
     * @param name
     * @param age
     * @param salaryScale
     * @param startDate
     * @param department
     * @param annualLeave
     * @param overTime
     */
    Employee(
            final String id,
            final String name,
            final Integer age,
            final Double salaryScale,
            final String startDate,
            final String department,
            final Integer annualLeave,
            final Integer overTime) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.overTime = overTime;
    }

    /**
     * @return the overTime
     */
    Integer getOverTime() {
        return overTime;
    }

    /**
     * @param overTime the overTime to set
     */
    void setOverTime(final Integer overTime) {
        this.overTime = overTime;
    }

    @Override
    public Double calculateSalary() {
        return (getSalaryScale() * 3000000) + (getOverTime() * 200000);
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
                "Overtime(hours)",
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
                getOverTime());
    }
}
