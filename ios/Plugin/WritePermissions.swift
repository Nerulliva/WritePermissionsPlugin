import Foundation

@objc public class WritePermissions: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
