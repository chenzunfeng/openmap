// **********************************************************************
// 
// <copyright>
// 
//  BBN Technologies, a Verizon Company
//  10 Moulton Street
//  Cambridge, MA 02138
//  (617) 873-8000
// 
//  Copyright (C) BBNT Solutions LLC. All rights reserved.
// 
// </copyright>
// **********************************************************************
// 
// $Source: /cvs/distapps/openmap/src/openmap/com/bbn/openmap/layer/terrain/ProfileDoNothingState.java,v $
// $RCSfile: ProfileDoNothingState.java,v $
// $Revision: 1.1.1.1 $
// $Date: 2003/02/14 21:35:48 $
// $Author: dietrick $
// 
// **********************************************************************


package com.bbn.openmap.layer.terrain;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import com.bbn.openmap.layer.util.stateMachine.*;

class ProfileDoNothingState extends State{

    protected ProfileGenerator profileTool;

    public ProfileDoNothingState(ProfileGenerator tool){
	profileTool = tool;
    }

    public boolean mousePressed(MouseEvent e){ 
	profileTool.addProfileEvent(e);
	profileTool.stateMachine.setState(ProfileStateMachine.TOOL_DRAW);
	return true;
    }
}









