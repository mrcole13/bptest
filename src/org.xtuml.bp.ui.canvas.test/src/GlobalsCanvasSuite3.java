
//=====================================================================
//
//File:      $RCSfile: GlobalsCanvasSuite2.javav $
//Version:   $Revision: 1.3 $
//Modified:  $Date: 2013/05/10 05:47:48 $
//
//(c) Copyright 2007-2014 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
// Licensed under the Apache License Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing software 
// distributed under the License is distributed on an "AS IS" BASIS WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//=====================================================================


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.xtuml.bp.ui.canvas.test.AutoReconciliationTests;
import org.xtuml.bp.ui.canvas.test.ClassToStateDiagramNavigationTest;
import org.xtuml.bp.ui.canvas.test.ConnectorsAsAnchorsTest;
import org.xtuml.bp.ui.canvas.test.FreeFloatingConnectorTest;
import org.xtuml.bp.ui.canvas.test.GlobalTestSetupClass;
import org.xtuml.bp.ui.canvas.test.GraphicalToolCreationTests;
import org.xtuml.bp.ui.canvas.test.I2053F2RenameTest;
import org.xtuml.bp.ui.canvas.test.I686ClearDatabaseTest;
import org.xtuml.bp.ui.canvas.test.I835OpenDiagramEditorWithSearchView;
import org.xtuml.bp.ui.canvas.test.InterfaceDrawingTests;
import org.xtuml.bp.ui.canvas.test.MultipleSupertypeTest;

import junit.framework.TestSuite;

/**
 * Test all areas of the canvas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GlobalTestSetupClass.class,
    ConnectorsAsAnchorsTest.class,
    FreeFloatingConnectorTest.class,
    GraphicalToolCreationTests.class,
    I686ClearDatabaseTest.class,
    // Disabled as per issue 9505
//    I835OpenDiagramEditorWithSearchView.class,
//    MultipleSupertypeTest.class,
    ClassToStateDiagramNavigationTest.class,
    I2053F2RenameTest.class,
    AutoReconciliationTests.class,
    InterfaceDrawingTests.class
})
public class GlobalsCanvasSuite3 extends TestSuite {
}