package com.company;

public class BirthdayParty {

//    Initialize all variables
    private String personName = "Anthony";
    private String location = "Los Angeles";
    private String venue = "El Rey Theatre";
    private int amountAttendees = 100;

    //    Empty constructor
    public BirthdayParty(){

    }

//    Constructor with only 2 variables
    public BirthdayParty(String personName, int amountAttendees){
        this.personName = personName;
        this.amountAttendees = amountAttendees;
    }

//    Constructor with ALL variables
    public BirthdayParty(String personName, String location, String venue, int amountAttendees){
        this.personName = personName;
        this.location = location;
        this.venue = venue;
        this.amountAttendees = amountAttendees;
    }

//    Getters
    public String getPersonName(){
        return personName;
    }

    public String getLocation(){
        return location;
    }

    public String getVenue(){
        return venue;
    }

    public int getAmountAttendees(){
        return amountAttendees;
    }

//    Setters
    public void setPersonName(String personName){
        this.personName = personName;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setVenue(String venue){
        this.venue = venue;
    }

    public void setAmountAttendees(int amountAttendees){
        this.amountAttendees = amountAttendees;
    }

//    Boolean
    public boolean partyIsLit(){
        return true;
    }

//    String
    public String attendeesSing(){
        return "Happy Birthday to you!";
    }

}
