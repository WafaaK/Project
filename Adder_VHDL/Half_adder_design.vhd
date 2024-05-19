----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    18:34:39 05/09/2024 
-- Design Name: 
-- Module Name:    Half_adder_design - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

---- Uncomment the following library declaration if instantiating
---- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Half_adder_design is
    Port ( x : in  STD_LOGIC;
           y : in  STD_LOGIC;
           c : out  STD_LOGIC;
           s : out  STD_LOGIC);
end Half_adder_design;

architecture Behavioral of Half_adder_design is

begin
c <= x and y;
s <= x xor y;

end Behavioral;

