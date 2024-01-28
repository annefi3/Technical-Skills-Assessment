package com.testsqa.cucumber;

public enum TestScenarios {
    T1("User valid login into web HRM"),
    T2("User logout"),
    T3("User invalid login into web HRM"),
    T4("User empty field web HRM"),
    T5("Admin go to Recruitment page"),
    T6("Admin add candidate without name"),
    T7("Admin add candidate without first name"),
    T8("Admin add candidate without last name"),
    T9("Admin add candidate"),
    T10("Admin add vacancies without name"),
    T11("Admin add vacancies without hiring manager"),
    T12("Admin add vacancies invalid hiring manager"),
    T13("Admin add vacancies"),
    T14("Admin go to Admin/User Management page"),
    T15("Admin add System Users without name"),
    T16("Admin add System Users without username"),
    T17("Admin add System Users"),
    T18("Admin empty Job Title"),
    T19("Admin add Job Title"),
    T20("Admin click menu Leave"),
    T21("Admin click menu Apply");


    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
