package com.Madesh.Assignments.three;

public class Magazine extends Item {
	private final int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() { return issueNumber; }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: [ID: " + getId() + ", Title: " + getTitle() + ", Issue: " + issueNumber + "]");
    }
}