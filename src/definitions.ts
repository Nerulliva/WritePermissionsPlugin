export interface WritePermissionsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
