package mybatis01;

public class ClassInfoDTO {
	private String acastartdate;
	private String acaenddate;
	private String acaday;
	private String acastarttime;
	private String acaendtime;
	private String acaclassname;
	private String numberofparticipants;
	private String numberofapplicants;
	private String classidx;
	private String teaidx;
	private String pay;
	private String teaname;
	private int setVirtualNum;
	private String classmembers;
		
	public ClassInfoDTO() {
	}
	public ClassInfoDTO(String acastartdate, String acaenddate, String acaday, String acastarttime, String acaendtime,
			String acaclassname, String numberofparticipants, String classidx, String teaidx, String pay,
			String teaname) {
		this.acastartdate = acastartdate;
		this.acaenddate = acaenddate;
		this.acaday = acaday;
		this.acastarttime = acastarttime;
		this.acaendtime = acaendtime;
		this.acaclassname = acaclassname;
		this.numberofparticipants = numberofparticipants;
		this.classidx = classidx;
		this.teaidx = teaidx;
		this.pay = pay;
		this.teaname = teaname;
	}
	
	public ClassInfoDTO(String acastartdate, String acaenddate, String acaday, String acastarttime, String acaendtime,
			String acaclassname, String numberofparticipants, String numberofapplicants, String classidx, String teaidx,
			String pay, String teaname, int setVirtualNum) {
		super();
		this.acastartdate = acastartdate;
		this.acaenddate = acaenddate;
		this.acaday = acaday;
		this.acastarttime = acastarttime;
		this.acaendtime = acaendtime;
		this.acaclassname = acaclassname;
		this.numberofparticipants = numberofparticipants;
		this.numberofapplicants = numberofapplicants;
		this.classidx = classidx;
		this.teaidx = teaidx;
		this.pay = pay;
		this.teaname = teaname;
		this.setVirtualNum = setVirtualNum;
	}
	public ClassInfoDTO(String acastartdate, String acaenddate, String acaday, String acastarttime, String acaendtime,
			String acaclassname, String numberofparticipants, String classidx, String teaidx, String pay,
			String teaname, int setVirtualNum) {
		super();
		this.acastartdate = acastartdate;
		this.acaenddate = acaenddate;
		this.acaday = acaday;
		this.acastarttime = acastarttime;
		this.acaendtime = acaendtime;
		this.acaclassname = acaclassname;
		this.numberofparticipants = numberofparticipants;
		this.classidx = classidx;
		this.teaidx = teaidx;
		this.pay = pay;
		this.teaname = teaname;
		this.setVirtualNum = setVirtualNum;
	}
	
	public ClassInfoDTO(String acastartdate, String acaenddate, String acaday, String acastarttime, String acaendtime,
			String acaclassname, String numberofparticipants, String numberofapplicants, String classidx, String teaidx,
			String pay, String teaname, int setVirtualNum, String classmembers) {
		super();
		this.acastartdate = acastartdate;
		this.acaenddate = acaenddate;
		this.acaday = acaday;
		this.acastarttime = acastarttime;
		this.acaendtime = acaendtime;
		this.acaclassname = acaclassname;
		this.numberofparticipants = numberofparticipants;
		this.numberofapplicants = numberofapplicants;
		this.classidx = classidx;
		this.teaidx = teaidx;
		this.pay = pay;
		this.teaname = teaname;
		this.setVirtualNum = setVirtualNum;
		this.classmembers = classmembers;
	}
	
	public String getClassmembers() {
		return classmembers;
	}
	public void setClassmembers(String classmembers) {
		this.classmembers = classmembers;
	}
	public String getNumberofapplicants() {
		return numberofapplicants;
	}
	public void setNumberofapplicants(String numberofapplicants) {
		this.numberofapplicants = numberofapplicants;
	}
	public int getSetVirtualNum() {
		return setVirtualNum;
	}
	public void setSetVirtualNum(int setVirtualNum) {
		this.setVirtualNum = setVirtualNum;
	}
	public String getAcastartdate() {
		return acastartdate;
	}
	public void setAcastartdate(String acastartdate) {
		this.acastartdate = acastartdate;
	}
	public String getAcaenddate() {
		return acaenddate;
	}
	public void setAcaenddate(String acaenddate) {
		this.acaenddate = acaenddate;
	}
	public String getAcaday() {
		return acaday;
	}
	public void setAcaday(String acaday) {
		this.acaday = acaday;
	}
	public String getAcastarttime() {
		return acastarttime;
	}
	public void setAcastarttime(String acastarttime) {
		this.acastarttime = acastarttime;
	}
	public String getAcaendtime() {
		return acaendtime;
	}
	public void setAcaendtime(String acaendtime) {
		this.acaendtime = acaendtime;
	}
	public String getAcaclassname() {
		return acaclassname;
	}
	public void setAcaclassname(String acaclassname) {
		this.acaclassname = acaclassname;
	}
	public String getNumberofparticipants() {
		return numberofparticipants;
	}
	public void setNumberofparticipants(String numberofparticipants) {
		this.numberofparticipants = numberofparticipants;
	}
	public String getClassidx() {
		return classidx;
	}
	public void setClassidx(String classidx) {
		this.classidx = classidx;
	}
	public String getTeaidx() {
		return teaidx;
	}
	public void setTeaidx(String teaidx) {
		this.teaidx = teaidx;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	
	
}
