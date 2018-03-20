package popout.back.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class FriendIdentity {
    @Column(name= "friendA")
    private int friendA;

    @Column(name = "friendB")
    private int friendB;

    public FriendIdentity(){}

    public FriendIdentity(int A, int B){
        this.friendA = A;
        this.friendB = B;
    }

    public int getFriendA() {
        return friendA;
    }

    public void setFriendA(int friendA) {
        this.friendA = friendA;
    }

    public int getFriendB() {
        return friendB;
    }

    public void setFriendB(int friendB) {
        this.friendB = friendB;
    }

}
