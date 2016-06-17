package org.springboot.sample.entity;

import java.util.Date;

/**
 * 成绩
 *
 * @author	wr
 * @create	2016年06月07日
 */
public class Score  extends BaseModel {

    private static final long serialVersionUID = 8127035730921338189L;

    private int id;

    private int stuId;

    private String subjectName;

    private float score;

    private Date examTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Date getExamTime() {
		return examTime;
	}

	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	} 

}

