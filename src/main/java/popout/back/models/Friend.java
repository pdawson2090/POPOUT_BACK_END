package popout.back.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Friend {
    @EmbeddedId
    private popout.back.models.FriendIdentity friendIdentity;

    protected Friend(){}

    public Friend(FriendIdentity newFriendIdentity){
        this.friendIdentity = newFriendIdentity;
    }

    public FriendIdentity getFriendIdentity() {
        return friendIdentity;
    }

    @Override
    public String toString() {
        return "Friend{" +
                " FriendA is " + friendIdentity.getFriendA() +
                " FriendB is " + friendIdentity.getFriendB() +
                '}';
    }
}
