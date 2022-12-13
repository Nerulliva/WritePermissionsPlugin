# WritePermissions

Richiesta permessi di scrittura file android >= 11

## Install

```bash
npm install write-permissions
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`setWritePermissions()`](#setwritepermissions)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### setWritePermissions()

```typescript
setWritePermissions() => Promise<{ value: boolean; }>
```

**Returns:** <code>Promise&lt;{ value: boolean; }&gt;</code>

--------------------

</docgen-api>
