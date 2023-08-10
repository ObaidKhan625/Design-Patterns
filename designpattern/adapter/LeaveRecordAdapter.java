package net.media.training.designpattern.adapter;

public class LeaveRecordAdapter implements LeaveRecord {
    private ThirdPartyLeaveRecord leaveRecord;

    public LeaveRecordAdapter(ThirdPartyLeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    String getMostAbsentEmployee() {
        Employee mostAbsentEmployee = leaveRecord.getMostAbsentEmployee();
        return mostAbsentEmployee.getName();
    }

    int getEmployeeAbsences(String employeeName) {
        return leaveRecord.getEmployeeAbsences(Employee.getEmployeeFromName(employeeName));
    }
}