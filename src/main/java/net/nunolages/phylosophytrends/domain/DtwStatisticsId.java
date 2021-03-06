// Generated Feb 24, 2019 12:02:22 AM by Hibernate Tools 5.3.6.Final

package net.nunolages.phylosophytrends.domain;

import java.util.Date;

/**
 * DtwStatisticsId generated by hbm2java
 */
public class DtwStatisticsId implements java.io.Serializable {

	private int phylosopherId;
	private Date statisticsDate;
	private long mentionNumber;
	private Date startDate;

	public DtwStatisticsId() {
	}

	public DtwStatisticsId(int phylosopherId, Date statisticsDate, long mentionNumber, Date startDate) {
		this.phylosopherId = phylosopherId;
		this.statisticsDate = statisticsDate;
		this.mentionNumber = mentionNumber;
		this.startDate = startDate;
	}

	public int getPhylosopherId() {
		return this.phylosopherId;
	}

	public void setPhylosopherId(int phylosopherId) {
		this.phylosopherId = phylosopherId;
	}

	public Date getStatisticsDate() {
		return this.statisticsDate;
	}

	public void setStatisticsDate(Date statisticsDate) {
		this.statisticsDate = statisticsDate;
	}

	public long getMentionNumber() {
		return this.mentionNumber;
	}

	public void setMentionNumber(long mentionNumber) {
		this.mentionNumber = mentionNumber;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DtwStatisticsId))
			return false;
		DtwStatisticsId castOther = (DtwStatisticsId) other;

		return (this.getPhylosopherId() == castOther.getPhylosopherId())
				&& ((this.getStatisticsDate() == castOther.getStatisticsDate())
						|| (this.getStatisticsDate() != null && castOther.getStatisticsDate() != null
								&& this.getStatisticsDate().equals(castOther.getStatisticsDate())))
				&& (this.getMentionNumber() == castOther.getMentionNumber())
				&& ((this.getStartDate() == castOther.getStartDate()) || (this.getStartDate() != null
						&& castOther.getStartDate() != null && this.getStartDate().equals(castOther.getStartDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPhylosopherId();
		result = 37 * result + (getStatisticsDate() == null ? 0 : this.getStatisticsDate().hashCode());
		result = 37 * result + (int) this.getMentionNumber();
		result = 37 * result + (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		return result;
	}

}
