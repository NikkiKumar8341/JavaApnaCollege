package SOLID_Principle.LSP.solution;

/**
 * Now if you observe we segregate specific functionality to separate class to follow LSP
 *
 * now its up to implementation class decision to support features , based on their desired feature they can use respective interface
 * for example instagram doesn’t support video call feature so instagram implementation can be design something like this
 *
 */

public class Instagram implements SocialMedia,SocialPostAndMediaManager{

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void publishPost(Object post) {

    }
}
