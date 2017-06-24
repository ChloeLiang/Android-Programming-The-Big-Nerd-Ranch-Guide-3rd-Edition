package com.bignerdranch.android.criminalintent;

public class CrimeSuspect {
    private String mName;
    private long mContactId;
    private String mNumber;

    public CrimeSuspect(String name) {
        mName = name;
    }

    public CrimeSuspect(String name, long contactId) {
        mName = name;
        mContactId = contactId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public long getContactId() {
        return mContactId;
    }

    public void setContactId(long contactId) {
        mContactId = contactId;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }
}
