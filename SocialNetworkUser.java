public class SocialNetworkUser {
  private String username;
  private int followerCount;

  public SocialNetworkUser(String username, int followerCount) {
    this.username = username;
    this.followerCount = followerCount;
  }

  public int getFollowerCount() {
    return followerCount;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public String toString() {
    return username + " (" + followerCount + " followers)";
  }
}