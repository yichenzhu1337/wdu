package com.whiteboard.repositories;

public class MainRepository {

    public MainRepository() {
        //System.out.println(this.getClass().getSimpleName());
    }

    public static void main(String args[]) {
        ProfileRepository profileRepository = new ProfileRepository();

        profileRepository.create();

        System.out.println(profileRepository.getById(1).getUsername());

        System.exit(0);
    }
}
