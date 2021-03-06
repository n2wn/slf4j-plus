// Fraunhofer Institute for Computer Graphics Research (IGD)
// Department Graphical Information Systems (GIS)
//
// Copyright (c) 2010 Fraunhofer IGD
//
// This file is part of slf4j-plus.
//
// slf4j-plus is free software: you can redistribute
// it and/or modify it under the terms of the GNU Lesser General Public License
// as published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// slf4j-plus is distributed in the hope that it will
// be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with slf4j-plus.
// If not, see <http://www.gnu.org/licenses/>.

package de.fhg.igd.slf4jplus.ui.userstatus;

import ch.qos.logback.classic.spi.LoggingEvent;


/**
 * Listener to the status observer
 * 
 * @author Simon Templer
 */
public interface StatusListener {
	
	/**
	 * Called when the status has changed
	 * 
	 * @param status the new status
	 * @param newMessages the number of new messages
	 * @param messages the number of messages
	 * @param event the event associated with the status changed, may be 
	 *   <code>null</code>
	 */
	public abstract void onStatusChanged(Status status, int newMessages,
			int messages, LoggingEvent event);

}
