package fr.tvbarthel.games.chasewhisply.model;

import android.os.Parcel;

import fr.tvbarthel.games.chasewhisply.model.weapon.Weapon;

public class GameInformationTutorial extends GameInformation {

	public static final int STEP_WELCOME = 0;
	public static final int STEP_UI_WELCOME = 1;
	public static final int STEP_CROSSHAIR = 2;
	public static final int STEP_COMBO = 3;
	public static final int STEP_AMMO = 4;
	public static final int STEP_AMMO_2 = 5;
	public static final int STEP_SCORE = 6;
	public static final int STEP_SERIOUS_THINGS = 7;
	public static final int STEP_TARGET = 8;
	public static final int STEP_KILL = 9;
	public static final int STEP_CONGRATULATION = 10;
	public static final int STEP_TARGET_2 = 11;
	public static final int STEP_KILL_2 = 12;
	public static final int STEP_CONGRATULATION_2 = 13;
	public static final int STEP_END = 14;

	private int mCurrentStep;

	public GameInformationTutorial(long spawningTime, Weapon weapon) {
		super(spawningTime, weapon);
		mCurrentStep = STEP_WELCOME;
	}

	@Override
	public void writeToParcel(Parcel out, int i) {
		super.writeToParcel(out, i);
		out.writeInt(mCurrentStep);
	}

	@Override
	public void readFromParcel(Parcel in) {
		super.readFromParcel(in);
		mCurrentStep = in.readInt();
	}

	public int nextStep() {
		mScoreInformation.increaseScore(20);
		return ++mCurrentStep;
	}

	public void setCurrentStep(int step) {
		mCurrentStep = step;
	}

	public int getCurrentStep() {
		return mCurrentStep;
	}
}
