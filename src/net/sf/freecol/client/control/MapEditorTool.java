/**
 *  Copyright (C) 2002-2024   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.control;

/**
 * Possible tools to use in the map editor.
 */
public enum MapEditorTool {

    //CURSOR("mapEditor.tool.cursor"),
    //SELECTION("mapEditor.tool.selection"),
    PAINTBRUSH("mapEditor.tool.paintBrush"),
    //FILL("mapEditor.tool.fill"),
    ;
    
    private final String id;
    
    private MapEditorTool(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
}
