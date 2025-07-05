package LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.HashSet;

class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class FriendConnectionManager {
    private User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    private User findUserById(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) return current;
            current = current.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
        if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);

        System.out.println("Friend connection added between User " + userId1 + " and User " + userId2);
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between User " + userId1 + " and User " + userId2);
    }

    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + " (User ID: " + userId + "):");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends.");
            return;
        }

        for (int friendId : user.friendIds) {
            User friend = findUserById(friendId);
            if (friend != null) {
                System.out.println(" - " + friend.name + " (User ID: " + friend.userId + ")");
            }
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        HashSet<Integer> set = new HashSet<>(user1.friendIds);
        ArrayList<Integer> mutual = new ArrayList<>();

        for (int id : user2.friendIds) {
            if (set.contains(id)) mutual.add(id);
        }

        System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ":");
        if (mutual.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int id : mutual) {
                User friend = findUserById(id);
                if (friend != null) {
                    System.out.println(" - " + friend.name + " (User ID: " + friend.userId + ")");
                }
            }
        }
    }

    public void searchUser(String key) {
        boolean found = false;
        User current = head;
        while (current != null) {
            if (String.valueOf(current.userId).equals(key) || current.name.equalsIgnoreCase(key)) {
                displayUser(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }

    public void countFriends() {
        User current = head;
        while (current != null) {
            System.out.println(current.name + " (User ID: " + current.userId + ") has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

    private void displayUser(User user) {
        System.out.println("User ID: " + user.userId);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Number of Friends: " + user.friendIds.size());
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        FriendConnectionManager manager = new FriendConnectionManager();

        manager.addUser(1, "Ayush", 22);
        manager.addUser(2, "Divanshu", 21);
        manager.addUser(3, "Riya", 20);
        manager.addUser(4, "Karan", 23);

        manager.addFriendConnection(1, 2);
        manager.addFriendConnection(1, 3);
        manager.addFriendConnection(2, 3);
        manager.addFriendConnection(3, 4);

        manager.displayFriends(1);
        manager.displayFriends(2);
        manager.displayFriends(3);

        System.out.println("\nMutual friends between 1 and 3:");
        manager.findMutualFriends(1, 3);

        System.out.println("\nSearching for user with name 'Karan':");
        manager.searchUser("Karan");

        System.out.println("\nCounting friends for all users:");
        manager.countFriends();

        System.out.println("\nRemoving friend connection between 1 and 2:");
        manager.removeFriendConnection(1, 2);
        manager.displayFriends(1);
        manager.displayFriends(2);
    }
}
