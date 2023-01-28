package bridge;

public class RemoteDVD extends Remotes {

  private boolean play = false;

  public RemoteDVD(AbstractDevice theDevice) {
    super(theDevice);

  }

  @Override
  public void centerButton() {

    play = !play;

    System.out.println("DVD is Playing: " + play);

  }

}
