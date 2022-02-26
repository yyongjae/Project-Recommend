package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


public class ProjectDAO {
	private Connection conn;
	private ResultSet rs;
	
	public ProjectDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/RP"; // localhost:3306은 본인 컴퓨터의 설치된 MySQL 서버 자체를 의미
			String dbID = "root";
			String dbPassword = "12345678";
			Class.forName("com.mysql.jdbc.Driver"); // MySQL에접근할 수 있도록 하는 매개체 라이브러리
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword); // 접속 완료 
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Project> getWebCheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList1_Web = TRUE";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Project> getAppCheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList1_Web = TRUE";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Project> getAICheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList1_Web = TRUE";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Project> get_Web_App_CheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList1_Web = True and checkList2_APP = True";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Project> get_Web_AI_CheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList1_Web = True and checkList3_AI = True";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Project> get_App_AI_CheckedProjectList() {
		String SQL = "SELECT * FROM RP WHERE checkList2_App = True and checkList3_AI = True";
		ArrayList<Project> list = new ArrayList<Project>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project project = new Project();
				project.setProjectID(rs.getInt(1)); 
				project.setCheckList1_Web(rs.getInt(2));
				project.setCheckList2_App(rs.getInt(3));
				project.setCheckList3_AI(rs.getInt(4));
				project.setProjectName(rs.getString(5));
				project.setProjectKeyword1(rs.getString(6));
				project.setProjectKeyword2(rs.getString(7));
				list.add(project);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
}
