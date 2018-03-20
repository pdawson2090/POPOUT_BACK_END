package popout.back.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FriendIdentity implements Serializable{
    @Column(name= "friendA")
    private long friendA;

    @Column(name = "friendB")
    private long friendB;

    public FriendIdentity(){}

    public FriendIdentity(long A, long B){
        this.friendA = A;
        this.friendB = B;
    }

    public long getFriendA() {
        return friendA;
    }

    public void setFriendA(long friendA) {
        this.friendA = friendA;
    }

    public long getFriendB() {
        return friendB;
    }

    public void setFriendB(long friendB) {
        this.friendB = friendB;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof FriendIdentity)) return false;
        FriendIdentity that = (FriendIdentity) o;
        return getFriendA() == that.getFriendA() &&
                getFriendB() == that.getFriendB();
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getFriendA(), getFriendB());
    }

}
