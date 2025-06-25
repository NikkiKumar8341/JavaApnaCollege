package SOLID_Principle.LSP;


//whatsapp don't have publishpost so it may cause problem

/**
 * due to publishPost() method whatsapp child is not substitute of parents SocialMedia
 *
 * because whatsapp doesn’t support upload photos and videos for friend it’s just a chatting application so it doesn’t follow LSP
 */
public class WhatApp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
