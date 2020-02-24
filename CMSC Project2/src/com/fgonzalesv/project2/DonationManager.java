package com.fgonzalesv.project2;

public class DonationManager implements DonationManageInterface {
    @Override
    public boolean managerLoadContainer(DonationPackage dPackage) throws ContainerException {
        return false;
    }

    @Override
    public boolean managerQueueVolunteer(Volunteer v) throws VolunteerException {
        return false;
    }

    @Override
    public boolean managerQueueRecipient(Recipient r) throws RecipientException {
        return false;
    }

    @Override
    public int donatePackage() throws VolunteerException, ContainerException, RecipientException {
        return 0;
    }

    @Override
    public DonationPackage[] managerArrayPackage() {
        return new DonationPackage[0];
    }

    @Override
    public Volunteer[] managerArrayVolunteer() {
        return new Volunteer[0];
    }

    @Override
    public Recipient[] managerArrayRecipient() {
        return new Recipient[0];
    }
}
