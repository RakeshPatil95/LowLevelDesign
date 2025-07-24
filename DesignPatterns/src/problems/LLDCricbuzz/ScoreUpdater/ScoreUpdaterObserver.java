package problems.LLDCricbuzz.ScoreUpdater;


import problems.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
