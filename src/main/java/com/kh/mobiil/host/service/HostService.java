package com.kh.mobiil.host.service;

import java.util.List;

import com.kh.mobiil.host.domain.Host;
import com.kh.mobiil.space.domain.Space;

import domain.space;
import domain.spaceImg;
import regervation.Reservation;


public interface HostService {

	Host getHostInfo(String hostEmail);
	
	int hostModify(Host host);

	int getRegervationTotalCount();

	List<Reservation> regervationList(int currentPage, int imit);
	
	int insertSpace(Space space);

	int insertSpaceImg(spaceImg spaceImg);

	int getSpaceTotalCount();

	List<space> spaceList(int currentPage, int boardLimit);
}
