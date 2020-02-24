package com.fgonzalesv.project2;

public class RecipientLine implements RecipientLineInterface {


    public RecipientLine(int i) {
    }

    @Override
    public boolean addNewRecipient(Recipient rc) throws RecipientException {
        return false;
    }

    @Override
    public Recipient recipientTurn() throws RecipientException {
        return null;
    }

    @Override
    public boolean recipientLineEmpty() {
        return false;
    }

    @Override
    public Recipient[] toArrayRecipient() {
        return new Recipient[0];
    }
}
