package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DirectoryDB {
	
	public static void main(String[] args) {
		
		List<Directory> dirList = new ArrayList<>();
		dirList.add(new Directory("1", "A", null));
		dirList.add(new Directory("2", "B", null));
		dirList.add(new Directory("2.1", "G", "2"));
		dirList.add(new Directory("2.2", "H", "2"));
		dirList.add(new Directory("2.2.1", "I", "2.2"));
		
		dirList.add(new Directory("3", "C", null));
		dirList.add(new Directory("3.1", "D", "3"));
		dirList.add(new Directory("3.1.1", "E", "3.1"));
		dirList.add(new Directory("3.2", "F", "3"));
		
		Map<String,DepartMentStructure> deptMap=new HashMap<>();
		deptMap.put(null, new DepartMentStructure("0","Root"));
		
		for(Directory dir : dirList)
		{
			if(deptMap.get(dir.getParentDeptId())==null)
			{
				deptMap.put(dir.getDeptId(), new DepartMentStructure(dir.getDeptId(),dir.getDeptName()));
			}
			else
			{
				DepartMentStructure dNew=new DepartMentStructure(dir.getDeptId(),dir.getDeptName());
				deptMap.get(dir.getParentDeptId()).getChildDepartment().add(dNew);
				deptMap.put(dir.getDeptId(),dNew);
			}
		}
		
		Set<DepartMentStructure> childDepartment=deptMap.get(null).getChildDepartment() ;
		System.out.println();
		
	}
	
	static class Directory
	{
		String deptId;
		String deptName;
		String parentDeptId;
		public String getDeptId() {
			return deptId;
		}
		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getParentDeptId() {
			return parentDeptId;
		}
		public void setParentDeptId(String parentDeptId) {
			this.parentDeptId = parentDeptId;
		}
		public Directory(String deptId, String deptName, String parentDeptId) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.parentDeptId = parentDeptId;
		}
	}

	static class DepartMentStructure
	{
		String deptId;
		String departMentName;
		Set<DepartMentStructure> childDepartment= new HashSet<>();
		
		public DepartMentStructure(String deptId, String departMentName) {
			super();
			this.deptId = deptId;
			this.departMentName = departMentName;
		}

		public Set<DepartMentStructure> getChildDepartment() {
			return childDepartment;
		}

		public void setChildDepartment(Set<DepartMentStructure> childDepartment) {
			this.childDepartment = childDepartment;
		}

		@Override
		public String toString() {
			return "DepartMentStructure [deptId=" + deptId + ", departMentName=" + departMentName + "]";
		}
		
		
	}
}
