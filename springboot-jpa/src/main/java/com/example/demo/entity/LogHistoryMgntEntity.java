package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNIF_LOG_HIS_MGNT")
public class LogHistoryMgntEntity {

	@Id
	@Column(name = "ULHM_ID")
	private String id;

	@Column(name = "ULHM_SEVR_CAT")
	private String sevrCat;

	@Column(name = "ULHM_SEVR_SRCH_NO")
	private String sevrSrchNo;

	@Column(name = "ULHM_ORG_CD")
	private String orgCd;

	@Column(name = "ULHM_EMP_NO")
	private String empNo;

	@Column(name = "ULHM_SYS_LCLS_CD")
	private String sysLclsCd;

	@Column(name = "ULHM_SYS_MCLS_CD")
	private String sysMclsCd;

	@Column(name = "ULHM_SYS_FRM_CD")
	private String sysFrmCd;

	@Column(name = "ULHM_FRM_DECL_NM")
	private String frmDeclNm;

	@Column(name = "ULHM_BZ_OCCR_DT")
	private String bzOccrDt;

	@Column(name = "ULHM_PTSV_PERI_ED_DT")
	private String ptsvPeriEdDt;

	@Column(name = "ULHM_SEVR_FILE_NM")
	private String sevrFileNm;

	@Column(name = "ULHM_SEVR_PATH_NM")
	private String sevrPathNm;

	@Column(name = "ULHM_USR_SECRT_GRD")
	private String usrSecrtGrd;

	@Column(name = "ULHM_ID_ADDR")
	private String ipAddr;

	@Column(name = "ULHM_REG_RESO_CNTS")
	private String regResoCnts;

	@Column(name = "ULHM_SCC_YN")
	private String sccYn;

	@Column(name = "ULHM_VF_DT")
	private Date vfDt;

	@Column(name = "ULHM_VT_DT")
	private Date vtDt;

	@Column(name = "ULHM_ENTRY_EMP_NO")
	private String entryEmpNp;

}