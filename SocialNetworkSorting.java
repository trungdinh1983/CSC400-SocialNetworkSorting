public class SocialNetworkSorting {
  public static void quickSort(SocialNetworkUser[] users, int low, int high) {
    if (low < high) {
      int pi = partition(users, low, high);
      quickSort(users, low, pi - 1);
      quickSort(users, pi + 1, high);
    }
  }

  private static int partition(SocialNetworkUser[] users, int low, int high) {
    int pivot = users[high].getFollowerCount();
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (users[j].getFollowerCount() > pivot) {
        i++;
        SocialNetworkUser temp = users[i];
        users[i] = users[j];
        users[j] = temp;
      }
    }

    SocialNetworkUser temp = users[i + 1];
    users[i + 1] = users[high];
    users[high] = temp;

    return i + 1;
  }

  public static void main(String[] args) {
    // Sample data
    SocialNetworkUser[] users = {
        new SocialNetworkUser("john_doe", 1500),
        new SocialNetworkUser("influencer123", 50000),
        new SocialNetworkUser("new_user", 100),
        new SocialNetworkUser("celebrity", 1000000),
        new SocialNetworkUser("regular_poster", 5000)
    };

    System.out.println("Before sorting:");
    System.out.println("==================");
    for (SocialNetworkUser user : users) {
      System.out.println(user);
    }

    // Sort users by follower count using Quick Sort
    quickSort(users, 0, users.length - 1);

    System.out.println("\nAfter sorting (by follower count, descending):");
    System.out.println("==================");
    for (SocialNetworkUser user : users) {
      System.out.println(user);
    }
  }
}