/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/


package com.badlogic.gdx.backends.lwjgl3;

import com.badlogic.gdx.ApplicationListener;

/**
 * Receives notifications of various window events, such as iconficiation,
 * focus loss and gain, and window close events. Can be set per window
 * via {@link Lwjgl3ApplicationConfiguration} and {@link Lwjgl3WindowConfiguration}.
 * Close events can be canceled by returning false.
 * 
 * @author badlogic
 *
 */
public interface Lwjgl3WindowListener {
	/**
	 * Called when the window is iconified, i.e. its minimize button
	 * was clicked. The window's {@link ApplicationListener} will
	 * be paused
	 */
	void iconified();
	
	/**
	 * Called when the window is deiconified, i.e. its task bar
	 * icon was clicked. The window's {@link ApplicationListener}
	 * will be resumed.
	 */
	void deiconified();
	
	/**
	 * Called when the window is maximized, or restored from the maximized state.
	 *
	 * @param isMaximized true if window is maximized, false if it leaves the maximized state
	 */
	void maximized(boolean isMaximized);

	/**
	 * Called when the window lost focus to another window. The
	 * window's {@link ApplicationListener} will continue to be
	 * called.
	 */
	void focusLost();
	
	/**
	 * Called when the window gained focus.
	 */
	void focusGained();		
	
	/** Called when the user requested to close the window, e.g. clicking
	 * the close button or pressing the window closing keyboard shortcut.
	 *
	 * @return whether the window should actually close **/
	boolean closeRequested();
	
	/**
	 * Called when external files are dropped into the window,
	 * e.g from the Desktop.
	 * 
	 * @param files array with absolute paths to the files
	 */
	void filesDropped(String[] files);

	/**
	 * Called when the window content is damaged and needs to be refreshed.
	 * If non-continuous rendering is used, applications should call
	 * {@link Lwjgl3Graphics#requestRendering()} to force a render update.
	 */
	void refreshRequested();

}
