package solid.live.srp;

public class EmployeeOutputter {
    Employee emp;

    public EmployeeOutputter(Employee emp) {
        this.emp = emp;
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + this.emp.getEmpId() + "'>" +
                "<span>" + this.emp.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (this.emp.getTotalLeaveAllowed() - this.emp.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(this.emp.getMonthlySalary() * 12) + "</span>";
        if (this.emp.getManager() != null) str += "<span>" + this.emp.getManager() + "</span>";
        else str += "<span>None</span>";
        int totalLeaveLeftPreviously = this.emp.calculateTotalLeaveLeftPreviously();
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}