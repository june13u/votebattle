package com.june13u.votebattle.mode;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Vote {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Long voteId;

	@Persistent
	Long stageId;

	@Persistent
	int voteA;

	@Persistent
	int voteB;

	public Long getVoteId() {
		return voteId;
	}

	public void setVoteId(Long voteId) {
		this.voteId = voteId;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public int getVoteA() {
		return voteA;
	}

	public void setVoteA(int voteA) {
		this.voteA = voteA;
	}

	public int getVoteB() {
		return voteB;
	}

	public void setVoteB(int voteB) {
		this.voteB = voteB;
	}
}
