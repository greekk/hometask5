package com.greekk.hometask5.profiles;

public class Main {
    public static void isProfilesEqual(Profile firstProfile, Profile secondProfile){
        boolean isEqual = firstProfile.equals(secondProfile);
        if(isEqual)
            System.out.println("Profiles are equal!");
        else
            System.out.println("Profiles aren't equal!");
    }

    public static void main(String[] args) {

        Profile firstProfile = new Profile();
        firstProfile.setFirstName("Alex");
        firstProfile.setLastName("Grich");
        firstProfile.setAge(40);
        firstProfile.setUser(new User("greekk", "asd#$5asd#$5", "user"));

        Profile thirdProfile = new Profile();
        thirdProfile.setFirstName("Alex");
        thirdProfile.setLastName("Grich");
        thirdProfile.setAge(40);
        thirdProfile.setUser(new User("greekk", "asd#$5asd#$5", "user"));

        Profile secondProfile = new Profile();
        secondProfile.setFirstName("Sveta");
        secondProfile.setLastName("Kon");
        secondProfile.setAge(42);
        secondProfile.setUser(new User());
        secondProfile.getUser().setLogin("Svetlanka");
        secondProfile.getUser().setPassword("234fds234fds");
        secondProfile.getUser().setRole("admin");

        isProfilesEqual(firstProfile, secondProfile);
        isProfilesEqual(firstProfile, thirdProfile);
        isProfilesEqual(secondProfile, thirdProfile);

        System.out.println(firstProfile);
        System.out.println(secondProfile);
        System.out.println(thirdProfile);

    }
}
