export interface WritePermissionsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  setWritePermissions(): Promise<{ value: boolean}>
}
