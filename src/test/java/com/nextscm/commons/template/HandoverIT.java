/*
 * Copyright (c) 2021. Increff
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.nextscm.commons.template;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.nextscm.commons.template.form.Address;
import com.nextscm.commons.template.form.HandoverForm;
import com.nextscm.commons.template.form.HandoverLineItem;
import com.nextscm.commons.template.util.FopUtil;
import com.nextscm.commons.template.util.Utils;
import com.nextscm.commons.template.util.VelocityUtil;

public class HandoverIT extends AbstractTest{

	@Test
	public void testManifest() throws IOException, TransformerException, URISyntaxException, SAXException {
		String fopTemplate = VelocityUtil.processVm(form(), Resources.HANDOVER_RESOURCE);
		FileOutputStream fos = new FileOutputStream("target/test-handover.pdf");
		FopUtil.convertToPDF(Resources.getResource(Resources.FOP_DATA_RESOURCE), Utils.toStream(fopTemplate), fos);
	}

	public static HandoverForm form() {
		HandoverForm form = new HandoverForm();
		form.setTransporter("Delhivery & Sons");
		form.setHandoverId("ho1234");
		form.setManifestId("mani1234");
		form.setClientName("Client Name 123456789 123456789 123456789 123456789 123456789 123456789 123456789");
		form.setHandoverTime(getDate());
		form.setChannelId("Amazon_SF");
		form.setChannelManifestId("AMZ_12345");
		Address vendorAddress = new Address();
		vendorAddress.setCity("Bangalore");
		form.setVendorAddress(vendorAddress);
		List<HandoverLineItem> HandoverLineItem = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			HandoverLineItem item = new HandoverLineItem();
			item.setAwbNo("1234567890awbNo&" + i);
//			item.setChannelOrderNo("1234567890 Channel & " + i);
			List<String> itemNames = new ArrayList<>();
			for (int j = 0; j < i + 1; j++) {
				itemNames.add("itemName &!@#$%^&*()_+<> " + j);
			}
			item.setItemNames(itemNames);
			item.setOrderNo("1234567890 order & " + i);
//			item.setQuantity(i);
//			item.setToPhone("+91990093090" + i);
//			item.setToZip("560102" + i);
			HandoverLineItem.add(item);
		}
		form.setLineItems(HandoverLineItem);
		return form;
	}

}
