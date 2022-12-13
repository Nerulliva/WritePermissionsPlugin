import { WebPlugin } from '@capacitor/core';

import type { WritePermissionsPlugin } from './definitions';

export class WritePermissionsWeb extends WebPlugin implements WritePermissionsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async setWritePermissions(): Promise<{ value: boolean }>{
    return Promise.resolve({value: false});
  }
}
