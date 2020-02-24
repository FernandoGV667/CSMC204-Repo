package com.fgonzalesv.project2;

public class VolunteerLine implements VolunteerLineInterface {
    @Override
    public boolean addNewVolunteer(Volunteer v) throws VolunteerException {
        return false;
    }

    @Override
    public Volunteer volunteerTurn() throws VolunteerException {
        return null;
    }

    @Override
    public boolean volunteerLineEmpty() {
        return false;
    }

    @Override
    public Volunteer[] toArrayVolunteer() {
        return new Volunteer[0];
    }
}
