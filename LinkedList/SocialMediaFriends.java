import java.util.Scanner;

class User {
    int userID, age;
    String name;
    int[] friends;
    int friendCount;
    User next;

    User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new int[10]; // max 10 friends for simplicity
        this.friendCount = 0;
        this.next = null;
    }

    void addFriend(int friendID) {
        if (friendCount < friends.length) {
            friends[friendCount++] = friendID;
        }
    }

    void removeFriend(int friendID) {
        for (int i = 0; i < friendCount; i++) {
            if (friends[i] == friendID) {
                for (int j = i; j < friendCount - 1; j++) {
                    friends[j] = friends[j + 1];
                }
                friendCount--;
                break;
            }
        }
    }

    boolean hasFriend(int friendID) {
        for (int i = 0; i < friendCount; i++) {
            if (friends[i] == friendID) return true;
        }
        return false;
    }

    void displayFriends() {
        System.out.print("Friends of " + name + ": ");
        for (int i = 0; i < friendCount; i++) {
            System.out.print(friends[i] + " ");
        }
        System.out.println();
    }
}

public class SocialMediaFriends {
    User head = null;

    void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newUser;
        }
    }

    User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.addFriend(id2);
            u2.addFriend(id1);
            System.out.println("Friend connection added between " + u1.name + " and " + u2.name);
        }
    }

    void removeFriendConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.removeFriend(id2);
            u2.removeFriend(id1);
            System.out.println("Friend connection removed.");
        }
    }

    void displayFriendsOfUser(int id) {
        User user = findUser(id);
        if (user != null) {
            user.displayFriends();
        } else {
            System.out.println("User not found!");
        }
    }

    void findMutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            System.out.print("Mutual Friends of " + u1.name + " and " + u2.name + ": ");
            for (int i = 0; i < u1.friendCount; i++) {
                int fID = u1.friends[i];
                if (u2.hasFriend(fID)) {
                    System.out.print(fID + " ");
                }
            }
            System.out.println();
        }
    }

    void searchUser(String nameOrID) {
        try {
            int id = Integer.parseInt(nameOrID);
            User user = findUser(id);
            if (user != null) {
                System.out.println("User Found: " + user.name + ", Age: " + user.age);
            } else {
                System.out.println("User not found.");
            }
        } catch (NumberFormatException e) {
            User temp = head;
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(nameOrID)) {
                    System.out.println("User Found: " + temp.name + ", ID: " + temp.userID + ", Age: " + temp.age);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("User not found.");
        }
    }

    void countFriendsOfAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendCount + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();
        Scanner sc = new Scanner(System.in);

        // Sample Users
        sm.addUser(1, "Shivangi", 22);
        sm.addUser(2, "Aditi", 21);
        sm.addUser(3, "Rohit", 23);
        sm.addUser(4, "Aman", 22);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);

        sm.displayFriendsOfUser(1);
        sm.findMutualFriends(1, 2);
        sm.searchUser("Rohit");
        sm.countFriendsOfAllUsers();
    }
}
