import { registerPlugin } from '@capacitor/core';

import type { WritePermissionsPlugin } from './definitions';

const WritePermissions = registerPlugin<WritePermissionsPlugin>('WritePermissions', {
  web: () => import('./web').then(m => new m.WritePermissionsWeb()),
});

export * from './definitions';
export { WritePermissions };
