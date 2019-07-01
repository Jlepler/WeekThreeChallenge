import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Resume {

    //Will change "name" to something more descriptive
    private Name name;
    private Name name1;
    private EmailAddress emailAddress;
    private PhoneNumber phoneNumber;
    private EduAchieve educationOne;
    private EduAchieve educationTwo;
    private EduAchieve educationThree;
    private WorkExp currentJob;
    private WorkExp mostRecentJob;
    private WorkExp pastJobNear;
    private WorkExp pastJobFar;
    private Skills compOne;
    private Skills compTwo;
    private Skills compThree;

//    public void Resume(){}

    public void AddResumeApp(){}


    //The object is being saved into Name class, but the Name instance is not transferring over to this constructor
    public Resume(Name name, Name name1, EmailAddress emailAddress, PhoneNumber phoneNumber,
                        EduAchieve educationOne, EduAchieve educationTwo, EduAchieve educationThree,
                        WorkExp currentJob, WorkExp mostRecentJob, WorkExp pastJobNear, WorkExp pastJobFar,
                        Skills compOne, Skills compTwo, Skills compThree) {
        this.name = getName();
        this.name1 = getName1();
        this.emailAddress = getEmailAddress();
        this.phoneNumber = getPhoneNumber();
        this.educationOne = getEducationOne();
        this.educationTwo = getEducationTwo();
        this.educationThree = getEducationThree();
        this.currentJob = getCurrentJob();
        this.mostRecentJob = getMostRecentJob();
        this.pastJobNear = getPastJobNear();
        this.pastJobFar = getPastJobFar();
        this.compOne = getCompOne();
        this.compTwo = getCompTwo();
        this.compThree = getCompThree();
    }







    @Override
    public String toString() {
        return "Resume{" +
                "name=" + name +
                ", name1=" + name1 +
                ", emailAddress=" + emailAddress +
                ", phoneNumber=" + phoneNumber +
                ", educationOne=" + educationOne +
                ", educationTwo=" + educationTwo +
                ", educationThree=" + educationThree +
                ", currentJob=" + currentJob +
                ", mostRecentJob=" + mostRecentJob +
                ", pastJobNear=" + pastJobNear +
                ", pastJobFar=" + pastJobFar +
                ", compOne=" + compOne +
                ", compTwo=" + compTwo +
                ", compThree=" + compThree +
                '}';
    }


    /*************************************getters/setters***********************************************/

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName1() {
        return name1;
    }

    public void setName1(Name name1) {
        this.name1 = name1;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EduAchieve getEducationOne() {
        return educationOne;
    }

    public void setEducationOne(EduAchieve educationOne) {
        this.educationOne = educationOne;
    }

    public EduAchieve getEducationTwo() {
        return educationTwo;
    }

    public void setEducationTwo(EduAchieve educationTwo) {
        this.educationTwo = educationTwo;
    }

    public EduAchieve getEducationThree() {
        return educationThree;
    }

    public void setEducationThree(EduAchieve educationThree) {
        this.educationThree = educationThree;
    }

    public WorkExp getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(WorkExp currentJob) {
        this.currentJob = currentJob;
    }

    public WorkExp getMostRecentJob() {
        return mostRecentJob;
    }

    public void setMostRecentJob(WorkExp mostRecentJob) {
        this.mostRecentJob = mostRecentJob;
    }

    public WorkExp getPastJobNear() {
        return pastJobNear;
    }

    public void setPastJobNear(WorkExp pastJobNear) {
        this.pastJobNear = pastJobNear;
    }

    public WorkExp getPastJobFar() {
        return pastJobFar;
    }

    public void setPastJobFar(WorkExp pastJobFar) {
        this.pastJobFar = pastJobFar;
    }

    public Skills getCompOne() {
        return compOne;
    }

    public void setCompOne(Skills compOne) {
        this.compOne = compOne;
    }

    public Skills getCompTwo() {
        return compTwo;
    }

    public void setCompTwo(Skills compTwo) {
        this.compTwo = compTwo;
    }

    public Skills getCompThree() {
        return compThree;
    }

    public void setCompThree(Skills compThree) {
        this.compThree = compThree;
    }
}

