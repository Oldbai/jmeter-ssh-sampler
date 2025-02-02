/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.jmeter.protocol.ssh.sampler;

import java.beans.PropertyDescriptor;

public class SSHSFTPSamplerBeanInfo extends AbstractSSHSamplerBeanInfo {

    public SSHSFTPSamplerBeanInfo() {

        super(SSHSFTPSampler.class);

        createPropertyGroup("fileTransfer", new String[]{
                "action", // $NON-NLS-1$
                "source", // $NON-NLS-1$
                "printFile",// $NON-NLS-1$
                "destination", // $NON-NLS-1$
                "sftpConnectionTimeout"

        });

        PropertyDescriptor p = property("action"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(DEFAULT, "get");
        p.setValue(TAGS, new String[]{
                SSHSFTPSampler.SFTP_COMMAND_GET,
                SSHSFTPSampler.SFTP_COMMAND_PUT,
                SSHSFTPSampler.SFTP_COMMAND_RM,
                SSHSFTPSampler.SFTP_COMMAND_RMDIR,
                SSHSFTPSampler.SFTP_COMMAND_MKDIR,
                SSHSFTPSampler.SFTP_COMMAND_LS,
                SSHSFTPSampler.SFTP_COMMAND_RENAME
        });

        p = property("source"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");

        p = property("printFile"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.TRUE);

        p = property("destination"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");


        p = property("sftpConnectionTimeout");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, 0);

    }

}
